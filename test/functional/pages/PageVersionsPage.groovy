package pages

import geb.Page
import modules.PageListItemModule

import static java.net.URLEncoder.encode

class PageVersionsPage extends Page {
    static url = "/page/show"
    static at = { title == "Page Versions" }

    static content = {
        versions { index -> moduleList PageListItemModule, $('.page-item'), index}
    }

    @Override
    String convertToPath(Object... args) {
        "/" + args.collect { encode(it, "UTF-8") }.join('/')
    }
}
