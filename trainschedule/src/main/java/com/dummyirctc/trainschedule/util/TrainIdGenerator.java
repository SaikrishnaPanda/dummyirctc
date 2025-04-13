package com.dummyirctc.trainschedule.util;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;

public class TrainIdGenerator implements IdentifierGenerator {

    private static final int MIN = 10000;
    private static final int MAX = 99999;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        Random random = new Random();
        Long generatedId;
        boolean exists;

        do {
            generatedId = (long) (random.nextInt((MAX - MIN) + 1) + MIN);
            exists = session.createQuery("select 1 from Train where tuid = :id")
                    .setParameter("id", generatedId)
                    .uniqueResult() != null;
        } while (exists);

        return generatedId;
    }
}