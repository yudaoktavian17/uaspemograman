package com.project.yuda.rest

import com.project.yuda.BuildConfig
import com.project.yuda.model.RootDataModel
import retrofit.http.GET
import rx.Observable

interface ApiService{
    // http://informatika.upgris.ac.id/mobile/data/index.php/api/example/detil_jadwal?key=2bbe1c3c229f5f6852b8c37f2535f6&npm=16670090
    @GET("detil_jadwal?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getJadwalKuliah(
    ): Observable<RootDataModel>

    @GET("detil_pribadi?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getProfil(
    ): Observable<RootDataModel>

}