import com.sky.test.Page
import groovy.time.TimeCategory

class BootStrap {

    def init = { servletContext ->
        Integer.metaClass.mixin TimeCategory
        Date.metaClass.mixin TimeCategory

        // no LIVE with versions in the future
        new Page(id: 1, name: 'page-one', status: 'wip', scheduleTime: 1.day.from.now).save()
        new Page(id: 2, name: 'page-one', status: 'wip', scheduleTime: 1.day.from.now + 1.second).save()
        new Page(id: 3, name: 'page-one', status: 'wip', scheduleTime: 2.day.from.now).save()
        new Page(id: 4, name: 'page-one', status: 'wip', scheduleTime: 3.day.from.now).save()

        // no LIVE with versions in the past and in the future
        new Page(id: 5, name: 'page-two', status: 'wip', scheduleTime: 1.day.ago).save()
        new Page(id: 6, name: 'page-two', status: 'wip', scheduleTime: 1.day.ago - 1.second).save()
        new Page(id: 7, name: 'page-two', status: 'wip', scheduleTime: 2.day.ago).save()
        new Page(id: 8, name: 'page-two', status: 'wip', scheduleTime: 2.day.from.now).save()
        new Page(id: 9, name: 'page-two', status: 'wip', scheduleTime: 3.day.from.now).save()

        // live with WIP versions in the past and in the future
        new Page(id: 10, name: 'page-three', status: 'live',  scheduleTime: 1.day.ago).save()
        new Page(id: 11, name: 'page-three', status: 'wip',   scheduleTime: 1.day.ago - 1.second).save()
        new Page(id: 12, name: 'page-three', status: 'done',  scheduleTime: 2.day.ago).save()
        new Page(id: 13, name: 'page-three', status: 'ready', scheduleTime: 2.day.from.now).save()
        new Page(id: 14, name: 'page-three', status: 'wip',   scheduleTime: 3.day.from.now).save()
    }

    def destroy = {
    }
}
