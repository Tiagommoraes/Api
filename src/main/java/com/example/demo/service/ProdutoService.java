package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }

    public Optional<Produto> findById(Long id){
        return produtoRepository.findById(id);
    }

    public Optional<Produto> update(Long id, Produto updateProduto){
        return produtoRepository.findById(id).map(existingModel ->{
            existingModel.setName(updateProduto.getName());
            existingModel.setDescription(updateProduto.getDescription());

            return produtoRepository.save(existingModel);
        });
    }


    public ResponseEntity<Void> delete(Long id){

        if(produtoRepository.existsById(id)){
            produtoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    
}