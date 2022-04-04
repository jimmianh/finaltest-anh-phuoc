package com.java.fis.finaltest.Service;

import com.java.fis.finaltest.Entity.Detective;

public interface IDetectiveService {
    Detective addDetective(Detective detective);
    Detective getAllDetective(Detective detective);
    Detective getByIdDetective(Detective detective);
    Detective updateDetective(Detective detective);
    Detective deleteDetective(Detective detective);
}
