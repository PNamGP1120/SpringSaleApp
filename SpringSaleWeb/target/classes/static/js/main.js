function deleteProduct(endpoint) {
    if (confirm("Ban chan chan xoa") === true) {
        fetch(endpoint, {
            method: "delete"
        }).then(res => {
            if (res.status === 204) {
                location.reload();
            } else {
                alert("He thong dang co loi!");
            }
        });
    }
}
