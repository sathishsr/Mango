package io.github.tonnyl.mango.data.remote

import android.content.Context
import io.github.tonnyl.mango.data.User
import io.github.tonnyl.mango.data.datasource.UserDataSource
import io.github.tonnyl.mango.retrofit.RetrofitClient
import io.github.tonnyl.mango.retrofit.UserService
import io.github.tonnyl.mango.util.AccountManager
import io.reactivex.Observable

/**
 * Created by lizhaotailang on 2017/6/28.
 */
object UserRemoteDataSource: UserDataSource {

    private val mUserService: UserService = RetrofitClient.createService(UserService::class.java, AccountManager.accessToken)

    override fun init(context: Context) {
        // Not required for the remote data source
        // because this function is only for [io.github.tonnyl.mango.data.local.UserLocalDataSource].
    }

    override fun getAuthenticatedUser(id: Long?): Observable<User> {
        return mUserService.getAuthenticatedUser()
    }

    override fun getAllAuthenticatedUsers(): Observable<List<User>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saveAuthenticatedUser(user: User) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateAuthenticatedUser(user: User) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteAuthenticatedUser(user: User) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUser(id: Long): Observable<User> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}