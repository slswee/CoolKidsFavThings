package com.coolkids.http4shelloworld.service

import com.coolkids.http4shelloworld.model.User
import com.coolkids.http4shelloworld.repository.UserRepo

import scala.concurrent.Future

class UserService(userRepo: UserRepo) {

// CRUD user
  def createUser(user: User): Future[User] = {

  }
}
