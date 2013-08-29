import grails.util.Holders

def plugin = Holders.getPluginManager().getGrailsPlugin('jquery-ui')
def jqver = plugin.version

modules = {
    'jquery-theme' {
        resource id:'theme',
            url:[ plugin: 'jqueryUi', dir: 'jquery-ui/themes/ui-lightness',
                  file:'jquery-ui-'+jqver+'.custom.css'], 
            attrs:[media:'screen, projection']
    }

    'jquery-ui' {
        dependsOn 'jquery', 'jquery-theme'
        
        resource id:'js', url:[plugin: 'jqueryUi', dir:'jquery-ui/js', file:"jquery-ui-${jqver}.custom.min.js"],
            nominify: true, disposition: 'head'
    }

    'jquery-ui-dev' {
        dependsOn 'jquery', 'jquery-theme'

        resource id:'js', url:[plugin: 'jqueryUi', dir:'jquery-ui/js', file:"jquery-ui-${jqver}.custom.js"]
    }
}