package dev.wow.homeservices;

import dev.wow.homeservices.models.Result;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Amanjeet Singh on 8/9/18.
 */
public interface ApiInterface {

    @GET("maps/api/directions/json")
    Single<Result> getDirections(@Query("mode") String mode,
                                 @Query("transit_routing_preference") String routingPreference,
                                 @Query("origin") String origin,
                                 @Query("destination") String destination,
                                 @Query("key") String apiKey);
}