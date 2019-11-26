package com.example.demo.fileutil;

import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author ：fh
 * @Title:通过Properties获取配置文件
 * @date ：Created in 2019/6/28 11:19
 * @最后修改人:
 * @最后修改时间：${date} ${time}
 * @description：${description}
 * @version: $version$
 * @copyright:成都信通网易医疗科技发展有限公司
 */
public class PropertiesUtilFTigger {
    /**绝对路径*/
    @Value("${fatTigger.absolutePath}")
    private  static   String  absolutePath;
    /**相对路径*/
    @Value("${fatTigger.relativePath}")
    private  static   String  relativePath;
    /**配置文件名*/
    @Value("${fatTigger.propertiesFileName}")
    private  static   String propertiesFileName;

    private static Properties properties = new Properties();

    /**
     * 写入配置文件
     * @param exeVisionFile
     * @return
     */
    private boolean setVersionToProperties(File exeVisionFile) {
        String timeStr = "0";
        Long updateTimme = System.currentTimeMillis();
        timeStr = DateFormatUtils.format(updateTimme, "yyyyMMddHHmmss");
        FileOutputStream outStream =null;
        try{
            outStream = new FileOutputStream(exeVisionFile);
            properties.setProperty("exeVersion",timeStr);
            //写入properties文件
            properties.store(outStream,"shang chuan dll time");
        } catch (Exception ex) {
            System.out.println("写入版本配置文件失败");
            ex.printStackTrace();
        }finally {
            if(outStream!=null){
                try{
                    outStream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
    /**
     /**
     * 获取配置文件dll版本号
     */
    private String getVersionToProperties(String  pathFile) {
        String  dllVersion = "0";
        File dllVisionFile = new File(pathFile);
        Map<String, String> map = new HashMap<String, String>();
        if(dllVisionFile.exists()){
            InputStream in =null;
            try{
                in = new BufferedInputStream(new FileInputStream(dllVisionFile));
                properties.load(new InputStreamReader(in, "utf-8"));
                dllVersion = properties.getProperty("exeVersion");
            } catch (Exception ex) {
                System.out.println("读取dll版本配置文件失败");
                ex.printStackTrace();
            }finally {
                if(in!=null){
                    try {
                        in.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
        Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entrySet) {
            map.put((String) entry.getKey(), (String) entry.getValue());
        }
        return dllVersion;
    }
}
