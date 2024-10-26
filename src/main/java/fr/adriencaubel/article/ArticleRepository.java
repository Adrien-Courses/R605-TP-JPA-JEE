package fr.adriencaubel.article;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

public class ArticleRepository {

    @PersistenceContext
    private EntityManager em;

    public ArticleJPA findById(Long id) {
        return em.find(ArticleJPA.class, id);
    }

    public List<ArticleJPA> findAll() {
        return em.createQuery("SELECT a FROM Article a", ArticleJPA.class).getResultList();
    }

    @Transactional
    public void save(ArticleJPA article) {
        if (article.getId() == null) {
            em.persist(article);
        } else {
            em.merge(article);
        }
    }

    @Transactional
    public void delete(Long id) {
    	ArticleJPA article = findById(id);
        if (article != null) {
            em.remove(article);
        }
    }
}
