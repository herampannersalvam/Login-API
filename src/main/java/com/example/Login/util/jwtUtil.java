package com.example.Login.util;

import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.example.Login.entity.Login;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@Component
public class jwtUtil {

	public static String secuet="This_is_secuet";
	public static long expriytime= 60*60;
	
	
	
	public String generatejwt(Login login) {
	    long millitime = System.currentTimeMillis();
	    long expritime = millitime + expriytime * 1000;

	    Date issuedAt = new Date(millitime);
	    Date expriyAt = new Date(expritime);

	    UUID uuid = login.getId();
	    String issuer = uuid.toString(); // Convert UUID to string
	    Claims claim = Jwts.claims().setIssuer(issuer).setIssuedAt(issuedAt).setExpiration(expriyAt);

	    return Jwts.builder().setClaims(claim).signWith(SignatureAlgorithm.HS256, secuet).compact();
	}

	
}
