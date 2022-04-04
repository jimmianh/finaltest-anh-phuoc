package com.java.fis.finaltest.Service;

import javax.transaction.Transactional;

import com.java.fis.finaltest.Entity.Evidence;
import com.java.fis.finaltest.Repository.DetectiveRepository;
import com.java.fis.finaltest.Repository.EvidenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EvidenceService implements IEvidenceService {
    @Autowired
    private EvidenceRepository evidenceRepository;

    @Override
    public Evidence addEvidence(Evidence evidence) {
        return null;
    }

    @Override
    public Evidence getAllEvidence(Evidence evidence) {
        return null;
    }

    @Override
    public Evidence getByIdEvidence(Evidence evidence) {
        return null;
    }

    @Override
    public Evidence updateEvidence(Evidence evidence) {
        return null;
    }

    @Override
    public Evidence deleteEvidence(Evidence evidence) {
        return null;
    }
}
