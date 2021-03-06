package com.the23rdTeam.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class SUMMERNOR_V4Repository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public String findIdByName(String name) {
        Query query = new Query();

        query.addCriteria(Criteria.where("name").is(name));
        query.with(Sort.by(Sort.Order.desc("id")));

        return null;
    }
}
