package com.certacon.poc.repositories;

import com.certacon.poc.models.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IDocumentoRepository extends JpaRepository<Documento, UUID> {
}
