package com.example.financeserviceelasticsearch.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.erhlc.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.client.erhlc.RestClients;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.financeserviceelasticsearch.repository")
@ComponentScan(basePackages = {"com.example.financeserviceelasticsearch"})
public class Config  {


    private String clusterName="http://localhost:9200";

    private String clusterNodes="localhost:9200";

    @Bean
    public RestHighLevelClient restHighLevelClient() {
        String[] nodes = clusterNodes.split(",");
        HttpHost[] httpHosts = new HttpHost[nodes.length];
        for (int i = 0; i < nodes.length; i++) {
            String[] hostAndPort = nodes[i].split(":");
            httpHosts[i] = new HttpHost(hostAndPort[0], Integer.parseInt(hostAndPort[1]), "http");
        }
        RestClientBuilder restClientBuilder = RestClient.builder(httpHosts);
        RestHighLevelClient client = new RestHighLevelClient(restClientBuilder);
        return client;
    }
}
