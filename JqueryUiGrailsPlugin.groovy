class JqueryUiGrailsPlugin {

    // the plugin version
    // JQUERY-UI-VERSION
    def version =  "1.10.3"
    // or JQUERY-UI-VERSION.PLUGIN_MINOR_REVISION
    // def version =  "1.10.3.1"

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.2 > *"
    // the other plugins this plugin depends on
    def dependsOn = [jquery:'1.6 > *']
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def author = "mabroukb"
    def authorEmail = ""
    def title = "jQuery UI Plugin"
    def description = '''Simply supplies jQuery UI resources, depends on jQuery plugin. Use this plugin to avoid resource duplication and conflicts.'''

    // URL to the plugin's documentation
    // TODO
    //    def documentation = "http://grails.org/plugin/jquery-ui"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "GPL2"

    // Details of company behind the plugin (if there is one)
    //    def organization = [ name: "My Company", url: "http://www.my-company.com/" ]

    // Any additional developers beyond the author specified above.
    //    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
    //    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: 'https://github.com/mabroukb/grails-jquery-ui']
    // PREVIOUS VERSION :
    //    def documentation = "http://grails.org/plugin/jquery-ui"
    //    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPJQUERYUI" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
