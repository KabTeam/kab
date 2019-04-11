package cn.bdqn.kab.service;

import cn.bdqn.kab.pojo.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ArticleService {

    /**
     * 添加新闻(文章)
     * @param article
     * @return
     */
    public Article addNewArticle(Article article);

    /**
     * 修改文章
     * @param article
     * @return
     */
    public  Article updateArticel(Article article);

    /**
     * 分页查询文章
     * @return
     */
    public Page<Article> getArticel(Integer currentPage,Integer pageSize);

    /**
     * 删除指定的文章
     * @param articelId
     */
    public  void deleteArticel(Integer articelId);

}
