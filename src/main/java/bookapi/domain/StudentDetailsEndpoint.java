package bookapi.domain;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BookDetailsEndpoint {
    @PayloadRoot(namespace = "book", localPart = "GetBookDetailsRequest")
    @ResponsePayload
    public GetBookDetailsResponse processCourseDetailsRequest(@RequestPayload GetBookDetailsRequest request) {
        GetBookDetailsResponse response = new GetBookDetailsResponse();
        BookDetails bookDetails = new BookDetails();
        bookDetails.setId(request.getId());
        bookDetails.setName("Adam");
        bookDetails.setPassportNumber("E1234567");
        response.setBookDetails(bookDetails);
        return response;
    }
}
