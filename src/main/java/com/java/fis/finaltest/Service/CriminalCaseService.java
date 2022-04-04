package com.java.fis.finaltest.Service;

import javax.transaction.Transactional;

import com.java.fis.finaltest.Entity.CriminalCase;
import com.java.fis.finaltest.Repository.CriminalCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CriminalCaseService implements ICriminalCaseService{

    @Autowired
    private CriminalCaseRepository criminalCaseRepository;


    @Override
    public CriminalCase addCriminalCase(CriminalCase criminalCase) {
        return null;
    }

    @Override
    public CriminalCase getByIdCriminalCase(CriminalCase criminalCase) {
        return null;
    }

    @Override
    public CriminalCase getAllCriminalCase(CriminalCase criminalCase) {
        return criminalCase;
    }

    @Override
    public CriminalCase updateCriminalCase(CriminalCase criminalCase) {
        return null;
    }

    @Override
    public CriminalCase deleteCriminalCase(CriminalCase criminalCase) {
        return null;
    }
}
