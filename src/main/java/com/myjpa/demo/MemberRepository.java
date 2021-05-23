package com.myjpa.demo;

import com.myjpa.demo.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository //@Repository: dao랑 비슷
public class MemberRepository {

    @PersistenceContext //entity 매니저 주입자동으로됨(spring-boot-stater-data-jpa)
    private EntityManager em;

    public Long save(Member member){
        em.persist(member);
        return member.getId();
    }

    public Member find(Long id){
        return em.find(Member.class, id);
    }
}
