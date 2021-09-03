package service

import model.User
import repository.UserRepo
import scala.concurrent.Future

class UserService(userRepo: UserRepo) {

// CRUD user
  def createUser(user: User): Future[User] = {

  }
}
