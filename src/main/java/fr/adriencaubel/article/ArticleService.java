package fr.adriencaubel.article;

import java.util.List;

import jakarta.inject.Inject;


public class ArticleService {

    @Inject
    private ArticleRepository articleRepository;

    public ArticleJPA getArticleById(Long id) {
        return articleRepository.findById(id);
    }

    public List<ArticleJPA> getAllArticles() {
        return articleRepository.findAll();
    }

    public void createOrUpdateArticle(ArticleJPA article) {
        articleRepository.save(article);
    }

    public void deleteArticle(Long id) {
        articleRepository.delete(id);
    }
}
