package com.markusdev.tiendamusicaldata.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public class CommonRepository<E, R extends PagingAndSortingRepository<E, Long>> {

    @Autowired
    protected R repository;

    public List<E> consultListPageable(int to, int from, String orderBy){
        Pageable pageable = PageRequest.of(to, from, Sort.by(orderBy));
        Page<E> page = this.repository.findAll(pageable);
        return  page.getContent();
    }

    public E save(E e){
        return this.repository.save(e);
    }

    public E update(E e){
        return this.repository.save(e);
    }

    public void delete(E e){
        this.repository.delete(e);
    }
}
