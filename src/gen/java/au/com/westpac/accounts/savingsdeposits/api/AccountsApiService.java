package au.com.westpac.accounts.savingsdeposits.api;

import au.com.westpac.accounts.savingsdeposits.api.*;
import au.com.westpac.accounts.savingsdeposits.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import au.com.westpac.accounts.savingsdeposits.InlineResponse200;
import au.com.westpac.accounts.savingsdeposits.InlineResponse500;
import au.com.westpac.accounts.savingsdeposits.InlineResponse400;

import java.util.List;
import au.com.westpac.accounts.savingsdeposits.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-17T18:45:24.812+11:00")
public abstract class AccountsApiService {
    public abstract Response retrieveAccountSummaryView(String xMessageId,String xBrandSilo,String xChannelType,String xOriginatingSystemId,String accountRef,String xAccountIdentifier,String xAppCorrelationId,String xOrganisationId,String xOriginatingSubSystemId,SecurityContext securityContext) throws NotFoundException;
}
