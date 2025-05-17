// SearchResource.java
package com.skyscanner;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/search")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SearchResource {
    private final List<SearchResult> allResults;

    public SearchResource(List<SearchResult> allResults) {
        this.allResults = allResults;
    }

    @POST
    public List<SearchResult> search(Search search) {
        String targetCity = search.getCity().toLowerCase();
        return allResults.stream()
            .filter(result -> result.getCity().toLowerCase().equals(targetCity))
            .collect(Collectors.toList());
    }
}