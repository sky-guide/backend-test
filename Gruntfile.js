module.exports = function (grunt) {
    grunt.util.linefeed = '\n';

    // Load grunt tasks automatically
    require('load-grunt-tasks')(grunt);

    grunt.config.init({
        pkg: grunt.file.readJSON('package.json')
    });

    grunt.config('karma', {
        options: {
            configFile: 'karma.conf.js'
        },
        unit: {
        }
    });

};
