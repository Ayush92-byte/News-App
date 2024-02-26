package com.loc.newsapp.domain.usecases.app_entry

import com.loc.newsapp.domain.Manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager : LocalUserManager
) {

    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}