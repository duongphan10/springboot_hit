package com.example.buoi7.mapper;

import com.example.buoi7.dto.StoreDTO;
import com.example.buoi7.model.Store;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-08T11:14:49+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class StoreMapperImpl implements StoreMapper {

    @Override
    public Store storeDTOToStore(StoreDTO storeDTO) {
        if ( storeDTO == null ) {
            return null;
        }

        Store store = new Store();

        return store;
    }
}
