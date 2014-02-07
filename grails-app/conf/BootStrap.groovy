import com.sky.test.Book
import com.sky.test.Book
import groovy.time.TimeCategory

class BootStrap {

    def init = { servletContext ->
        Integer.metaClass.mixin TimeCategory
        Date.metaClass.mixin TimeCategory

        // no LIVE with versions in the future
        new Book(id: 1, name: 'book-one', status: 'wip', scheduleTime: 1.day.from.now).save()
        new Book(id: 2, name: 'book-one', status: 'wip', scheduleTime: 1.day.from.now + 1.second).save()
        new Book(id: 3, name: 'book-one', status: 'wip', scheduleTime: 2.day.from.now).save()
        new Book(id: 4, name: 'book-one', status: 'wip', scheduleTime: 3.day.from.now).save()

        // no LIVE with versions in the past and in the future
        new Book(id: 5, name: 'book-two', status: 'wip', scheduleTime: 1.day.ago).save()
        new Book(id: 6, name: 'book-two', status: 'wip', scheduleTime: 1.day.ago - 1.second).save()
        new Book(id: 7, name: 'book-two', status: 'wip', scheduleTime: 2.day.ago).save()
        new Book(id: 8, name: 'book-two', status: 'wip', scheduleTime: 2.day.from.now).save()
        new Book(id: 9, name: 'book-two', status: 'wip', scheduleTime: 3.day.from.now).save()

        // live with WIP versions in the past and in the future
        new Book(id: 10, name: 'book-three', status: 'live',  scheduleTime: 1.day.ago).save()
        new Book(id: 11, name: 'book-three', status: 'wip',   scheduleTime: 1.day.ago - 1.second).save()
        new Book(id: 12, name: 'book-three', status: 'done',  scheduleTime: 2.day.ago).save()
        new Book(id: 13, name: 'book-three', status: 'ready', scheduleTime: 2.day.from.now).save()
        new Book(id: 14, name: 'book-three', status: 'wip',   scheduleTime: 3.day.from.now).save()
    }

    def destroy = {
    }
}
