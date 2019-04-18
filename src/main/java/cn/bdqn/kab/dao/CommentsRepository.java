package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.Article;
import cn.bdqn.kab.pojo.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends JpaRepository<Comments,Integer>, JpaSpecificationExecutor<Comments> {

}
