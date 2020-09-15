package com.twilio;

import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import org.apache.http.auth.AUTH;

public class MakeCall {

    public static final String ACCOUNT_SID = "ACc3b40a23b1c2771758d794dd78a8aaf5";
    public static final String ACCOUNT_TOKEN = "9d39afd5f5289926fe166d02af966ddc";


    public static void main(String[] args) throws URISyntaxException {



        Twilio.init(ACCOUNT_SID, ACCOUNT_TOKEN);

/**
 *
* The tuto gave us a System.getenv - I couldn't find how to fucking
 * configure that shit, so, I added the full number, please go ahead and update accordingly
 * Be aware, you need to add permission on the Twilio console for international calls
 * https://www.twilio.com/console/voice/calls/geo-permissions/low-risk
 *
* */

        Call call = Call.creator(
                new PhoneNumber("+573108471661"),
                new PhoneNumber("+12067371401"),
                new URI("https://demo.twilio.com/docs/voice.xml")
        ).create();

    }
}


















