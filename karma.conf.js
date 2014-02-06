module.exports = function (config) {
    config.set({
        basePath: 'web-app',

        frameworks: ['jasmine', 'detectBrowsers'],

        files: [
            'bower_components/jquery/jquery.js',
            'scripts/**/*.js',
            '../test/js/**/*.js'
        ],

        exclude: [],

        // possible values: LOG_DISABLE || LOG_ERROR || LOG_WARN || LOG_INFO || LOG_DEBUG
        logLevel: config.LOG_INFO,

        autoWatch: true,

        // Continuous Integration mode
        // if true, it capture browsers, run tests and exit
        singleRun: true
    });
};
