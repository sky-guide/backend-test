modules = {
  'application-js' {
    resource url: 'js/application.js', disposition: 'defer'
  }

  'vendor-js' {
    resource url: 'js/vendor/angular.min.js', disposition: 'defer'
    resource url: 'js/vendor/jquery.min.js', disposition: 'defer'
  }

  'application-css' {
    resource url: 'css/main.css'
  }
}