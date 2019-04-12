package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer>, JpaSpecificationExecutor<Article> {

    /**
     * 根据Id查询文章
     * @param articleId
     * @return
     */
    public Article findByArticleid(Integer articleId);
}
