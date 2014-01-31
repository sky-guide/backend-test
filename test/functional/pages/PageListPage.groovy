package pages

import geb.Page
import modules.PageListItemModule

class PageListPage extends Page {
    static url = "/page/index"
    static at = { title == "Pages" }

    static content = {
        pages { index -> moduleList PageListItemModule, $('.page-item'), index}
    }


}
