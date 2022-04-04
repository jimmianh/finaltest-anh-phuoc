package com.java.fis.finaltest.Service;

import com.java.fis.finaltest.Entity.Evidence;

public interface IEvidenceService {
    Evidence addEvidence(Evidence evidence);
    Evidence getAllEvidence(Evidence evidence);
    Evidence getByIdEvidence(Evidence evidence);
    Evidence updateEvidence(Evidence evidence);
    Evidence deleteEvidence(Evidence evidence);
}
