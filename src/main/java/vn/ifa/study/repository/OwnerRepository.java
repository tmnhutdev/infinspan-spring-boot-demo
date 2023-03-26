package vn.ifa.study.repository;

import java.util.List;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;

import org.infinispan.Cache;
import org.infinispan.manager.EmbeddedCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.ifa.study.config.CacheListener;
import vn.ifa.study.model.Owner;

@Repository
public class OwnerRepository {
    
    @Autowired
    private EmbeddedCacheManager cacheManager;
     
    private CacheListener cacheListener = new CacheListener();
    
    private Cache<String, Owner> owners;
    
    @PostConstruct
    public void init() {
        this.owners = this.cacheManager.getCache("owners");
        this.owners.addListener(this.cacheListener);
    }
    
    public Owner save(Owner owner) {
        return this.owners.put(owner.getId(), owner);
    }
    
    public Owner findById(String id) {
        return this.owners.get(id);
    }
    
    public List<Owner> findAll() {
        return this.owners.entrySet().stream().map(Entry::getValue).toList();
    }

}
