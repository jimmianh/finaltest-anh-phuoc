package com.java.fis.finaltest.Service;

import com.java.fis.finaltest.Entity.CriminalCase;

public interface ICriminalCaseService {
    CriminalCase addCriminalCase(CriminalCase criminalCase);
    CriminalCase getByIdCriminalCase(CriminalCase criminalCase);
    CriminalCase getAllCriminalCase(CriminalCase criminalCase);
    CriminalCase updateCriminalCase(CriminalCase criminalCase);
    CriminalCase deleteCriminalCase(CriminalCase criminalCase);
}
