package services;

import com.auth0.jwt.*;
import com.auth0.jwt.algorithms.*;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.exceptions.*;
import java.io.UnsupportedEncodingException;

public class JwtUtil{

    private final static String secret = "jJ9M5hpHvhnJfmYH5zbKmmZPVGL";

    public static String createToken(String username, String password, boolean isAdmin)
    {
        try {
            return JWT.create()
                    .withIssuer("auth0")
                    .withClaim("username", username)
                    .withClaim("isAdmin", isAdmin)
                    .sign(Algorithm.HMAC256(secret));
        }
        catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static String getUsernameFromToken(String token)
    {
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(secret))
                    .withIssuer("auth0")
                    .build();
            DecodedJWT jwt = verifier.verify(token);
            return jwt.getClaim("username").asString();
        } catch (JWTDecodeException exception){
            return null;
        } catch (UnsupportedEncodingException e) {
            return null;
        } catch (SignatureVerificationException e){
            return null;
        }
    }

    public static boolean VerifyAdmin(String token)
    {
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(secret))
                    .withIssuer("auth0")
                    .build();
            DecodedJWT jwt = verifier.verify(token);
            return jwt.getClaim("isAdmin").asBoolean();
        } catch (JWTDecodeException exception){
            return false;
        } catch (UnsupportedEncodingException e) {
            return false;
        } catch (SignatureVerificationException e){
            return false;
        }
    }

}