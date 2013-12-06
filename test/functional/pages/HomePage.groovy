package pages

import geb.Page

class HomePage extends Page {
  static url = "/"
  static at = { title == "Welcome to Cognitive Imperative" }

  static content = {
    title { $('head title') }
  }
}
