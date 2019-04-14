package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.core.query.Query;
import service.SUMMENOR_V$Service;

@Repository
public class SUMMERNOR_V4Repository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public String findIdByName(String name) {
        Query query = new Query();

        query.addCriteria(Criteria.where("name").is(name));
        query.with(Sort.by(Sort.Order.desc("id")));


    }
}
