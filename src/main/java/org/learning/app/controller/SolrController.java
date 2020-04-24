/**
 * 
 */
package org.learning.app.controller;

import org.learning.app.repository.SolrContentRepository;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author vivek.agrawal
 *
 */
@RestController
public class SolrController {

	String urlString = "http://localhost:8983/solr/testCore";

	@Autowired
	SolrContentRepository solrContentRepository;

	@GetMapping("/content")
	public String content(@RequestParam String city) throws IOException, SolrServerException {
		//Format format = new Format()

		HttpSolrClient solr = new HttpSolrClient.Builder(urlString).build();
		solr.setParser(new XMLResponseParser());

		SolrInputDocument document = new SolrInputDocument();
		document.addField("id", "123456");
		document.addField("name", "Kenmore Dishwasher");
		document.addField("price", "599.99");
		solr.add(document);
		solr.commit();

		/*String description = "";
		HighlightPage<Content> highlightedContents = solrContentRepository.findByCityIn(city, Pageable.unpaged());
		highlightedContents.getContent();
		for (HighlightEntry<Content> content : highlightedContents.getHighlighted()) {
		    for (Highlight highlight : content.getHighlights()) {
				for (String snipplet : highlight.getSnipplets()) {
					description += snipplet;
		    }
		  }
		}
		return description;*/
		return "taskComplted";
	}


}
