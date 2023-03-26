package vn.ifa.study.config;

import org.infinispan.notifications.Listener;
import org.infinispan.notifications.cachelistener.annotation.CacheEntryCreated;
import org.infinispan.notifications.cachelistener.annotation.CacheEntryLoaded;
import org.infinispan.notifications.cachelistener.annotation.CacheEntryVisited;
import org.infinispan.notifications.cachelistener.event.CacheEntryCreatedEvent;
import org.infinispan.notifications.cachelistener.event.CacheEntryLoadedEvent;
import org.infinispan.notifications.cachelistener.event.CacheEntryVisitedEvent;
import org.infinispan.notifications.cachemanagerlistener.annotation.CacheStarted;
import org.infinispan.notifications.cachemanagerlistener.event.CacheStartedEvent;

import lombok.extern.slf4j.Slf4j;
import vn.ifa.study.model.Owner;

@Slf4j
@Listener
public class CacheListener {
    
    @CacheEntryCreated
    public void cacheEntryCreated(CacheEntryCreatedEvent<String, Owner> event) {
        log.info("Created entry: {}", event.getKey());
    }
    
    @CacheEntryLoaded
    public void cacheEntryCreated(CacheEntryLoadedEvent<String, Owner> event) {
        log.info("Loaded entry: {}", event.getKey());
    }
    
    @CacheEntryVisited
    public void cacheEntryVisited(CacheEntryVisitedEvent<String, Owner> event) {
        log.info("Visited entry: {}", event.getKey());
    }
    
    @CacheStarted
    public void cacheStarted(CacheStartedEvent event) {
        log.info("Started cache: {}", event.getCacheName());
    }

}
