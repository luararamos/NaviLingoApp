package org.luaramartins.navilingoapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform