package com.java.fis.finaltest.Service;

import javax.transaction.Transactional;

import com.java.fis.finaltest.Entity.Detective;
import com.java.fis.finaltest.Repository.CriminalCaseRepository;
import com.java.fis.finaltest.Repository.DetectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DetectiveService implements IDetectiveService{
    @Autowired
    private DetectiveRepository detectiveRepository;

    @Override
    public Detective addDetective(Detective detective) {
        return null;
    }

    @Override
    public Detective getAllDetective(Detective detective) {
        return null;
    }

    @Override
    public Detective getByIdDetective(Detective detective) {
        return null;
    }

    @Override
    public Detective updateDetective(Detective detective) {
        return null;
    }

    @Override
    public Detective deleteDetective(Detective detective) {
        return null;
    }
}
