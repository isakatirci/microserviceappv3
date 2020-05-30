package com.isakatirci.ticketservice.repository.es;

import com.isakatirci.ticketservice.model.es.TicketModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface TicketElasticRepository extends ElasticsearchRepository<TicketModel, String> {
}
