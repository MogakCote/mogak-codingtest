package com.ormi.mogakcote.problem.infrastructure;

import com.ormi.mogakcote.problem.domain.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface LanguageRepository extends JpaRepository<Language, Long>{

    Optional<Language> findByLanguageId(Long id);

    void deleteByLanguageId(Long id);
}
