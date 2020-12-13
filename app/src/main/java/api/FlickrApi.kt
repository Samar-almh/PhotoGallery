package api

import com.samar.photogallery.FlickrResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

import retrofit2.http.Url

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList"
                + "&api_key=cc6d1a8c28bdfd96a79de333814b549d"
                + "&format=json" + "&nojsoncallback=1" + "&extras=url_s")

    fun fetchPhotos(): Call<FlickrResponse>
    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>


}