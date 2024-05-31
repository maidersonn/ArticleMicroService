package com.maider.article.infrastructure;

import com.maider.article.domain.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JpaArticleRepository extends JpaRepository<Article, Long>, JpaSpecificationExecutor<Article> {
}
