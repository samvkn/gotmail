
const DOM = {

    classToggle(event){

        const listItems = document.querySelectorAll('.inbox-list-item')

        listItems.forEach(item => {
            item.classList.remove('active')
        })

        event.currentTarget.classList.add('active')
    },

}