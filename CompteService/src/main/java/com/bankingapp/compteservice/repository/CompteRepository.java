package com.bankingapp.compteservice.repository;
import com.bankingapp.compteservice.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository

//commentaire
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
