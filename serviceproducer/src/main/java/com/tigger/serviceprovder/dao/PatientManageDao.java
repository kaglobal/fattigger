package com.tigger.serviceprovder.dao;

import com.tigger.serviceprovder.model.pojo.Patient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatientManageDao {
    List<Patient> getAllPatient();
    Patient getPatientById(@Param("id") String id);
    int updateById(Patient patient);
    int deleteById(@Param("id") String id);
}
